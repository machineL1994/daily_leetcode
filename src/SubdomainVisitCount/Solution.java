package SubdomainVisitCount;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cpdomains = sc.nextLine().trim().split(",");
        List<String> res = subdomaininVisits(cpdomains);
        for (String e_str: res) {
            System.out.print(e_str+" ");
        }
    }

    /**
     * cpdomains 字符串数组里面每一个元素以空格分隔前面表示已经访问的次数，后面表示当前的domain
     * 后面的这个domain以"."进行分割,然后从后往前组装，组装放入到map中存储，后续如果出现已经存在的东西则直接数字相加
     * 然后输出map里面存储的东西
     * @param cpdomains
     * @return
     */
    public static List<String> subdomaininVisits(String[] cpdomains){
        Map<String, Integer> mymap = new HashMap<>();
        for (String s: cpdomains) {
            int val_count = Integer.parseInt(s.split(" ")[0]);
            String domains = s.split(" ")[1];
            String[] strs = domains.split("\\.");
//            StringBuilder cur = new StringBuilder();
            String cur = "";
            for (int i = strs.length-1; i >= 0; i--) {
                cur = strs[i]+ (i < strs.length-1 ? "." : "")+cur;
                mymap.put(cur, mymap.getOrDefault(cur, 0)+val_count);
            }
        }
        List<String> res = new ArrayList<>();
        for (String str : mymap.keySet()) {
            res.add(""+mymap.get(str)+" "+str);
        }
        return res;

    }
}
