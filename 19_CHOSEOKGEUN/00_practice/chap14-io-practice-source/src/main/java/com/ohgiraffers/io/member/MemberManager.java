package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    private Member[] members;

    private static final String FILE_NAME = "members.ser";

    // members.ser 파일을 읽어서 필드에 저장하고, 출력하는 메소드
    public void readMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            members = (Member[]) ois.readObject();
            System.out.println("===== 회원 목록 출력 =====");
            for (Member m : members) {
                if (m != null) {
                    System.out.println(m);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("members.ser 파일이 존재하지 않습니다.");
        } catch (EOFException e) {
            System.out.println("파일 끝 도달.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Member 객체를 추가하고, members.ser에 덮어쓰기 저장
    public void addMember(Member newMember) {
        Member[] newList;

        if (members == null) {
            newList = new Member[1];
        } else {
            newList = new Member[members.length + 1];
            System.arraycopy(members, 0, newList, 0, members.length);
        }

        newList[newList.length - 1] = newMember;
        members = newList;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(members);
            System.out.println("회원이 성공적으로 추가되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
