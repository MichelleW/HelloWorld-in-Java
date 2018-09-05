public class StringManipulator{
  public String trimAndConcat (String strA, String strB) {
    return strA.trim() + strB.trim();
    
  }

  public Integer getIndexOrNull(String str,String charA){
    return str.indexOf(charA);
  }


  public String concatSubstring(String str1, int beginIdx, int endIdx, String str2){
    String subStr = str1.substring(beginIdx, endIdx);
    String conc = subStr.concat(str2);
    return conc;
  }



}
