/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package Java001;

/**
 *  課題 Java基礎 Java001 Test05  <br />
 *  起動時引数（複数・文字列）の表示 <br />
 *  更新履歴 2015/11/15 岡智美：新規作成 <br />
 */
  public class Test05 {

  /**
   * メインメソッド <br />
   * 処理を起動します。 <br />
   * @param args 実行時引数
   */
    public static void main( String[] args ) {
      System.out.println( args[0] + "\n" + args[1]);    //改行ありで引数1・引数2を表示
    }

  }
