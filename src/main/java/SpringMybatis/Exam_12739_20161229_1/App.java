package SpringMybatis.Exam_12739_20161229_1;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;

import com.springmybais.service.FilmService;
import com.springmybatis.util.Util;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner;
	private static FilmService filmService;
	
	public static void main(String args[]){
		init();
		
		//
		requsetInput();
	}
	
	private static void init(){
		scanner = new Scanner(System.in);
		filmService = Util.getFilmService();
	}
	
	private static void requsetInput(){
			//请输入电影名称 请输入电影名称 (title):
			System.out.println("请输入电影名称 请输入电影名称 (title):");
			
			String title = scanner.nextLine();
			
			//请输入电影描述 请输入电影描述 (description):
			System.out.println("请输入电影描述 请输入电影描述 (description):");
			String description = scanner.nextLine();
			
			//请输入语言 ID(language_id):
			System.out.println("请输入语言 ID(language_id):");
			String language_id = scanner.nextLine();
			int id = Integer.parseInt(language_id);
			
			//执行插入
			try {
				filmService.insertIntoFilm(title, description, id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//
			Util.getApplicationContext().registerShutdownHook();
			
	}
}
