package com.cleancode.fitnesse.testablehtml;

import fitnesse.wiki.*;

public class TestableHtml {
    public String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        boolean isTest = pageData.hasAttribute("Test");
        if(isTest){
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, includeSuiteSetup);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, includeSuiteSetup);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }

    private void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean includeSuiteSetup) {
    }
    private void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean includeSuiteSetup) {
    }
}