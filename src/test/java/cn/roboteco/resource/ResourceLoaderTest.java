package cn.roboteco.resource;


import org.springframework.core.io.*;
import org.testng.Assert;

public class ResourceLoaderTest {
    public static void main(String[] args) {
        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:conf/file1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(ClassPathResource.class, resource.getClass());
        Resource resource2 = loader.getResource("file:conf/file1.txt");
        //验证返回的是ClassPathResource
        Assert.assertEquals(UrlResource.class, resource2.getClass());
        Resource resource3 = loader.getResource("cn/roboteco/dao/UserDao.class");
        //验证返默认可以加载ClasspathResource
        Assert.assertTrue(resource3 instanceof ClassPathResource);
    }
}
