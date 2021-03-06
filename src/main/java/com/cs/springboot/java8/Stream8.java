package com.cs.springboot.java8;

import cn.hutool.core.util.ObjectUtil;
import com.cs.springboot.java8.vo.Student;

/**
 * @author: ChuShi
 * @date: 2019/11/25 1:22 下午
 * @desc: java8的stream
 */
public class Stream8 {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        list.add(8);
        list.add(11);
        list.add(4);
        //并行流
        Stream<Integer> stream = list.stream();
        //顺序流
        Stream<Integer> stream1 = list.parallelStream();
        //无限流创建stream,一定要配合limit否则会无限制创建下去
        Stream.generate(Math::random).limit(5);

        stream.distinct();
        stream1.filter(a->a>5);
        list.stream().sorted(Comparator.comparing(a->a)).limit(5);
        list.stream().sorted(Comparator.comparing(a->a)).skip(5);

        list.stream().map(a->a+1).forEach(System.out::println);*/

        /*StringBuffer randomCode = new StringBuffer();
        // 用字符数组的方式随机
        String model = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] m = model.toCharArray();
        for (int j = 0; j < 6; j++) {
            char c = m[(int) (Math.random() * 36)];
            // 保证六位随机数之间没有重复的
            if (randomCode.toString().contains(String.valueOf(c))) {
                j--;
                continue;
            }
            randomCode.append(c);
        }
        System.out.println(randomCode);*/
        Student student = new Student();
        System.out.println(ObjectUtil.defaultIfNull(student.getId(),"好"));

    }
}
