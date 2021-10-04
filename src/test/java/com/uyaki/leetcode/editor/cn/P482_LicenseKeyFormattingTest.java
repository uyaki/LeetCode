package com.uyaki.leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P482_LicenseKeyFormattingTest {
    @Test
    public void licenseKeyFormatting() {
        P482_LicenseKeyFormatting.Solution solution = new P482_LicenseKeyFormatting().new Solution();
        Assert.assertEquals("R", solution.licenseKeyFormatting("r", 1));
        Assert.assertEquals("", solution.licenseKeyFormatting("---", 3));
        Assert.assertEquals("2-5G-3J", solution.licenseKeyFormatting("2-5g-3-J", 2));
        Assert.assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}