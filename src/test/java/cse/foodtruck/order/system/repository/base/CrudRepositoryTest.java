package cse.foodtruck.order.system.repository.base;

import cse.foodtruck.order.system.repository.base.CrudRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrudRepositoryTest {

    private CrudRepository<EntityClass, Integer> crudRepository;

    @BeforeEach
    void setUp() {
        crudRepository = new CrudRepository<>(); // Replace with your actual repository class
        EntityClass entity = new EntityClass(); // Replace with your actual entity class
        crudRepository.setEntity(entity);
    }

    @AfterEach
    void tearDown() {
        crudRepository.deleteAll();
    }

    @Test
    void testSave() {
        EntityClass entity = new EntityClass(); // Replace with your actual entity class
        EntityClass savedEntity = crudRepository.save(entity);
        assertNotNull(savedEntity);
    }

    @Test
    void testDeleteById() {
        EntityClass entity = new EntityClass(); // Replace with your actual entity class
        EntityClass savedEntity = crudRepository.save(entity);
        Integer id = savedEntity.getId(); // Replace with your actual entity's primary key getter
        assertTrue(crudRepository.deleteById(id));
    }

    @Test
    void testDeleteAll() {
        assertTrue(crudRepository.deleteAll());
    }

    @Test
    void testFindAll() {
        EntityClass entity1 = new EntityClass(); // Replace with your actual entity class
        EntityClass entity2 = new EntityClass(); // Replace with your actual entity class
        crudRepository.save(entity1);
        crudRepository.save(entity2);
        ArrayList<EntityClass> entities = crudRepository.findAll();
        assertEquals(2, entities.size());
    }

    @Test
    void testUpdate() {
        EntityClass entity = new EntityClass(); // Replace with your actual entity class
        EntityClass savedEntity = crudRepository.save(entity);
        savedEntity.setSomeField("Updated Value");
        EntityClass updatedEntity = crudRepository.update(savedEntity);
        assertEquals("Updated Value", updatedEntity.getSomeField());
    }

    @Test
    void testFindById() {
        EntityClass entity = new EntityClass(); // Replace with your actual entity class
        EntityClass savedEntity = crudRepository.save(entity);
        Integer id = savedEntity.getId(); // Replace with your actual entity's primary key getter
        EntityClass foundEntity = crudRepository.findById(id);
        assertNotNull(foundEntity);
    }
}
