package test.java.com.soecode.lyf.service.impl;

import static org.junit.Assert.fail;

import com.soecode.lyf.dao.BbsPostDao;
import com.soecode.lyf.entity.BbsPost;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.java.com.soecode.lyf.BaseTest;


public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BbsPostDao bbsPostDao;

	@Test
	public void testQueryById() throws Exception {
		long bookId = 1;
		BbsPost book = bbsPostDao.queryById(bookId);
		System.out.println(book);
	}
}
