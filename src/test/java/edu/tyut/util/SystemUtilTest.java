package edu.tyut.util;

import edu.tyut.service.helper.LoginHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class SystemUtilTest {

    @Test
    public void getImplementations() {
        SystemUtil.getImplementations(LoginHelper.class);
    }
}