package com.miko.demo.neo4j.service;

import com.miko.demo.neo4j.model.EntityD;
import com.miko.demo.neo4j.repository.EntityDRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * The MIT License
 *
 * Copyright 2014 Miroslav Kopecky.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * Created with IntelliJ IDEA.
 * User: miroslavkopecky
 * Date: 1/9/14
 */

@Service("entityDService")
@SuppressWarnings("unchecked")
public class EntityDServiceImpl implements EntityDService {

    @Autowired
    EntityDRepository entityDRepository;

    private Logger logger = LoggerFactory.getLogger(EntityAServiceImpl.class);

    @Override
    public EntityD findOne(Long id) {
        return entityDRepository.findOne(id);
    }

    @Override
    public EntityD findByName(String name) {
        return entityDRepository.findByName(name);
    }

    @Override
    public EntityD findByDescription(String description) {
        return entityDRepository.findByDescription(description);
    }

    @Override
    public EntityD save(EntityD entityD) {
        return entityDRepository.save(entityD);
    }

    @Override
    public void delete(EntityD entityD) {
        entityDRepository.delete(entityD);
    }
}
