package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.dao.IBookDao;
import com.ck.entity.Book;
import com.ck.utils.DBUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test(){
        SqlSession sqlSession = DBUtils.openSession(false);
        IBookDao bookDao = sqlSession.getMapper(IBookDao.class);
        List<Book> books = bookDao.getBooks();
        System.out.println(books);
        sqlSession.close();
        Object str = "";
    }
}
