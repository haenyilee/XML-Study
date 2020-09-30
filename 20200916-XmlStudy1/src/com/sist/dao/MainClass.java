package com.sist.dao;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		List<MusicVO> list=MusicDAO.musicAllData();
		for(MusicVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
	}

}

