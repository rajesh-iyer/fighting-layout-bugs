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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    SimpleTextDetectorTest.class,
    AnimationAwareTextDetectorTest.class,
    SimpleEdgeDetectorTest.class,
    DetectInvalidImageUrlsTest.class,
    DetectTextNearOrOverlappingVerticalEdgeTest.class,
    DetectTextWithTooLowContrastTest.class,
    WebPageTest.class
})
public class AllTestsUsingFirefoxDriver {

    @BeforeClass
    public static void freezeTestWebPageFactory() {
        TestWebPageFactory.UsingFirefoxDriver.freeze();
    }

    @AfterClass
    public static void meltTestWebPageFactory() {
        TestWebPageFactory.UsingFirefoxDriver.melt();
    }
}
