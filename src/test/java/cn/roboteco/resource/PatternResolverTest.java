package cn.roboteco.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PatternResolverTest {
    @Test
    public void getResource() throws Exception{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:cn/roboteco/**/*.xml");
        assertNotNull(resources);

        for (Resource resource : resources){
            System.out.println(resource.getDescription());
        }
    }
}
