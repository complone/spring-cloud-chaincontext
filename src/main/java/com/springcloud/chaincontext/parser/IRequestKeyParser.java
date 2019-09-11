package com.springcloud.chaincontext.parser;

import javax.servlet.http.HttpServletRequest;

/**
 * The strategy to parse keys info
 * @author complone
 * @email yuluoxinsheng@gmail.com
 */
public interface IRequestKeyParser {

    /**
     * Parse key from {@link HttpServletRequest}
     * @param key
     * @param request
     * @return
     */
    String parse(String key, HttpServletRequest request);
}
