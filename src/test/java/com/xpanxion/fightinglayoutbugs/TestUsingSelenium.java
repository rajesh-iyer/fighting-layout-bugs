/*
 * Copyright 2009-2012 Michael Tamm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xpanxion.fightinglayoutbugs;

import com.xpanxion.fightinglayoutbugs.helpers.TestWebPageFactory;
import com.xpanxion.fightinglayoutbugs.helpers.TestWebServer;
import org.junit.AfterClass;

/**
 * Base class for tests using <a href="http://selenium.googlecode.com">Selenium</a>,
 * which also takes care of starting and stopping a {@link TestWebServer} when needed
 * to serve the HTML pages located under the <code>src/test/webapp</code> directory.
 */
public class TestUsingSelenium {

    @AfterClass
    public static void disposeLastTestWebPageFactory() {
        TestWebPageFactory.disposeLastFactory();
    }

    protected WebPage getWebPageFor(String pathToHtmlPageOrCompleteUrl) {
        return TestWebPageFactory.UsingFirefoxDriver.createFor(pathToHtmlPageOrCompleteUrl);
    }

}
