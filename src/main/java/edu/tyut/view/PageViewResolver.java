package edu.tyut.view;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author TYUT_LH
 */
public class PageViewResolver implements ViewResolver, Ordered {
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
