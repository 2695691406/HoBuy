package hobuy.service.extar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import hobuy.domain.Img_group;
import hobuy.service.utils.FileUpload;

public class ImgGroupFiles {
	private MultipartFile[] imggroup;
	private MultipartFile img;

	public MultipartFile[] getImggroup() {
		return imggroup;
	}

	public void setImggroup(MultipartFile[] imggroup) {
		this.imggroup = imggroup;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}

	public Img_group saveImgs(HttpServletRequest request) {
		Img_group img_group = new Img_group();
		FileUpload fileUpload = new FileUpload();
		int i = 1;
		for (MultipartFile multipartFile : imggroup) {
			switch (i) {
			case 1:
				img_group.setImg1url(fileUpload.save(multipartFile, request));
				break;
			case 2:
				img_group.setImg2url(fileUpload.save(multipartFile, request));
				break;
			case 3:
				img_group.setImg3url(fileUpload.save(multipartFile, request));
				break;
			case 4:
				img_group.setImg4url(fileUpload.save(multipartFile, request));
				break;
			case 5:
				img_group.setImg5url(fileUpload.save(multipartFile, request));
				break;
			default:
				break;
			}
			i++;

		}
		if (img_group.getImg1url() == null || img_group.getImg1url().trim().length() < 1) {
			return null;
		} else {
			return img_group;
		}

	}

	public String saveImg(HttpServletRequest request) {
		return new FileUpload().save(img, request);
	}

}
