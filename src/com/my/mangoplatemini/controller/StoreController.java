package com.my.mangoplatemini.controller;

import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

import com.my.mangoplatemini.dao.StoreDAO;
import com.my.mangoplatemini.dto.MenuDTO;

public class StoreController {
	Scanner scanner = new Scanner(System.in);
	StoreDAO storeDAO = new StoreDAO();

	// 메뉴 등록
	public void crateMenu() {
		MenuDTO menuDTO = new MenuDTO();
		
		System.out.println("등록하실 메뉴의 이름을 입력해주세요.");
		String name = scanner.nextLine();
		menuDTO.setName(name);

		System.out.println("등록하실 메뉴의 가격을 입력해주세요.");
		Integer price = Integer.parseInt(scanner.nextLine());
		menuDTO.setPrice(price);

		storeDAO.createMenu(menuDTO);
	}

	// 메뉴 조회
	public void showMenu(String business_no) {
		storeDAO.showMenu(business_no);
	
		int no;
		
		while (true) {
			System.out.println("1. 메뉴 수정        2. 메뉴 삭제");
			no = Integer.parseInt(scanner.nextLine());
			if (no == 1) {
				updateMenu();
				break;
			} else if (no == 2) {
				deleteMenu();
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	// 메뉴 수정
	public void updateMenu() {
		MenuDTO menuDTO = new MenuDTO();
		
		System.out.println("수정하실 메뉴의 이름을 입력해주세요.");
		String beforeName = scanner.nextLine();
		menuDTO.setBeforeName(beforeName);
		
		System.out.println("수정 후 메뉴의 이름을 입력해주세요.");
		String name = scanner.nextLine();
		menuDTO.setName(name);

		System.out.println("수정 후 메뉴의 가격을 입력해주세요.");
		Integer price = Integer.parseInt(scanner.nextLine());
		menuDTO.setPrice(price);
		
		storeDAO.updateMenu(menuDTO);
	}

	// 메뉴 삭제
	public void deleteMenu() {
		MenuDTO menuDTO = new MenuDTO();
		
		System.out.println("삭제하실 메뉴의 번호를 입력해주세요.");
		int no = scanner.nextInt();
		menuDTO.setNo(no);
		
		storeDAO.deleteMenu(menuDTO);
	}
	
}