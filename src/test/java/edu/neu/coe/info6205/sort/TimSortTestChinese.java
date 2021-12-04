package edu.neu.coe.info6205.sort;


import com.ibm.icu.text.Collator;
import edu.neu.coe.info6205.sort.util.FileUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertArrayEquals;

public class TimSortTestChinese {

    @Test
    public void sortSeaShells() {
        String[] sortedChinese = new String[]{"阿冰", "阿冰冰", "阿超"};
        String[] unsortedChinese = new String[]{"阿超", "阿冰", "阿冰冰"};
//        String[] sortedChinese = new String[]{"阿滨", "阿春春", "阿丹丹", "阿鼎"};
//        String[] unsortedChinese = new String[]{"阿丹丹", "阿鼎", "阿滨", "阿春春" };
        Arrays.sort(unsortedChinese);
        TimSort.sort(unsortedChinese);
        System.out.println(Arrays.toString(unsortedChinese));
        assertArrayEquals(sortedChinese, unsortedChinese);
    }

    @Test
    public void GeneralTest() throws IOException {
        String[] a = FileUtil.readFileInRange("src/main/resources/shuffledChinese.txt",100);
        String[] b = FileUtil.readFileInRange("src/main/resources/shuffledChinese.txt",100);
        Collator collator = Collator.getInstance(Locale.CHINA);
        Arrays.sort(a,(x1, x2)->collator.compare(x1,x2));
        TimSort.sort(b);

        for(int i=0;i<10;i++){
            System.out.println(a[i] + " " + b[i]);
        }
        assertArrayEquals(a, b);

    }
}