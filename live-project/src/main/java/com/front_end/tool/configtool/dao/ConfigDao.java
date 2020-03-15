package com.front_end.tool.configtool.dao;

import com.front_end.domain.Config;
import com.front_end.tool.configtool.fileUtils.FileInit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//配置文件的控制层
public class ConfigDao {

    //初始化将文件读入ArrayList
    public List<Config> initConfig() throws IOException {

        FileInit fileInit = new FileInit();

        //获取文件的路径
        String file_path = fileInit.init();

        //使用utf-8 处理汉字编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file_path), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line = null;
        int count = 0;

        List<Config> list = new ArrayList<Config>();

        while ((line = br.readLine()) != null) {

            Config config = new Config();

            //拆分存入
            String[] arr = line.split(" ");
            if (arr.length > 3) {

                config.setStart_date(arr[0]);
                config.setEnd_date(arr[1]);
                config.setMax_have(Integer.parseInt(arr[2]));
                config.setMax_mask(Integer.parseInt(arr[3]));

                //插入
                list.add(config);
            }
            count++;
        }

        /*System.out.println(list);
        System.out.println("读取总条数：" + count + "||读取的list的长度" + list.size());*/
        return list;

    }

    //清空配置
    public void emptyConfig() throws IOException {

        FileInit fileInit = new FileInit();

        //获取文件的路径
        String file_path = fileInit.init();

        BufferedWriter out = null;

        //拼接格式覆盖文件
        String empty_conent = "";

        try {
            out = new BufferedWriter(new FileWriter(file_path, false));//false覆盖
            out.write(empty_conent);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    //添加联系人
    public boolean insertConfig(Config config) throws IOException{

        //获取所有行
        List<Config> list = initConfig();

        FileInit fileInit = new FileInit();

        //获取文件的路径
        String file_path = fileInit.init();

        BufferedWriter out = null;

        //拼接格式追加在文件末尾
        String conent = config.toString();

        try {

            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file_path, true)));//true追加
            out.write(conent + "\n");

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //如过超出最大值则返回false
        return false;

    }

}
