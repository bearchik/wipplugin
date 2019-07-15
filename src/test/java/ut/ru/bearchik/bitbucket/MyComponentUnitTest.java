package ut.ru.bearchik.bitbucket;

import org.junit.Test;
import ru.bearchik.bitbucket.api.MyPluginComponent;
import ru.bearchik.bitbucket.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}