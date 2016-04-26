package hobuy.service.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	/**
	 * 保存图片到webapps中的img文件夹下
	 * 
	 * @param multipartFile
	 * @param request
	 * @return
	 */
	public String save(MultipartFile multipartFile, HttpServletRequest request) {
		if (multipartFile.isEmpty()) {
			return "";
		}

		String filename = multipartFile.getOriginalFilename();
		filename = UUID.randomUUID() + filename.substring(filename.lastIndexOf("."));
		String path = request.getServletContext().getRealPath("");
		String imgurl = File.separator + "img" + File.separator + filename;
		path = path.substring(0, path.length() - request.getServletContext().getContextPath().length()) + imgurl;
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream(new File(path));
			outputStream.write(multipartFile.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("图片保存失败!");
		}

		return imgurl;
	}
}
