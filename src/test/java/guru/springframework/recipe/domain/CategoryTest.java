package guru.springframework.recipe.domain;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @org.junit.Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @org.junit.Test
    public void setDescription() {
    }

    @org.junit.Test
    public void setRecipes() {
    }
}