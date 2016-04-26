package hobuy.service.extar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import hobuy.domain.Product;
import hobuy.domain.Repertory;
import hobuy.service.utils.FileUpload;

public class ProductRepertory {
	private java.lang.String pro1s[];
	private java.lang.String pro2s[];
	private java.lang.String pro3s[];
	private double prices[];
	private java.lang.String imgurls[];
	private MultipartFile imgs[];
	private Integer repertory_nubme[];
	private List<Repertory> repertories = new ArrayList<Repertory>();
	private Long clazz_id;
	private Long pro_id;

	public Long getClazz_id() {
		return clazz_id;
	}

	public void setClazz_id(Long clazz_id) {
		this.clazz_id = clazz_id;
	}

	public Long getPro_id() {
		return pro_id;
	}

	public void setPro_id(Long pro_id) {
		this.pro_id = pro_id;
	}

	public Integer[] getRepertory_nubme() {
		return repertory_nubme;
	}

	public void setRepertory_nubme(Integer[] repertory_nubme) {
		this.repertory_nubme = repertory_nubme;
	}

	public MultipartFile[] getImgs() {
		return imgs;
	}

	public void setImgs(MultipartFile[] imgs) {
		this.imgs = imgs;
	}

	public java.lang.String[] getImgurls() {
		return imgurls;
	}

	public void setImgurls(java.lang.String[] imgurls) {
		this.imgurls = imgurls;
	}

	public List<Repertory> getRepertories() {
		return repertories;
	}

	public void setProduct() {
	}

	public java.lang.String[] getPro1s() {
		return pro1s;
	}

	public void setPro1s(java.lang.String[] pro1s) {
		this.pro1s = pro1s;
	}

	public java.lang.String[] getPro2s() {
		return pro2s;
	}

	public void setPro2s(java.lang.String[] pro2s) {
		this.pro2s = pro2s;
	}

	public java.lang.String[] getPro3s() {
		return pro3s;
	}

	public void setPro3s(java.lang.String[] pro3s) {
		this.pro3s = pro3s;
	}

	public double[] getPrices() {
		return prices;
	}

	public void setPrices(double[] prices) {
		this.prices = prices;
	}

	public List<Repertory> saveImg(HttpServletRequest request, Product product) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		FileUpload fileUpload = new FileUpload();
		int i = 0;
		for (MultipartFile multipartFile : imgs) {

			String imgurl = fileUpload.save(multipartFile, request);

			Repertory repertory = new Repertory();
			repertory.setImgurl(imgurl);
			if (pro1s == null || pro1s.length < i + 1) {
				repertory.setPro1(null);
			} else {
				repertory.setPro1(pro1s[i]);
			}
			if (pro2s == null || pro2s.length < i + 1) {
				repertory.setPro2(null);
			} else {
				repertory.setPro2(pro2s[i]);
			}
			if (pro3s == null || pro3s.length < i + 1) {
				repertory.setPro3(null);

			} else {
				repertory.setPro3(pro3s[i]);
			}
			repertory.setProduct(product);
			repertory.setRepertory_nubmer(repertory_nubme[i]);
			repertory.setPrice(prices[i]);
			repertories.add(repertory);
			i++;

		}
		return repertories;
	}

	@Override
	public String toString() {
		return "ProductRepertory [pro1s=" + Arrays.toString(pro1s) + ", pro2s=" + Arrays.toString(pro2s) + ", pro3s="
				+ Arrays.toString(pro3s) + ", prices=" + Arrays.toString(prices) + ", imgurls="
				+ Arrays.toString(imgurls) + ", imgs=" + Arrays.toString(imgs) + ", repertory_nubme="
				+ Arrays.toString(repertory_nubme) + ", repertories=" + repertories + "]";
	}

	// @Test
	// public void test() {
	// String name = "123.jpg";
	// name = UUID.randomUUID() + name.substring(name.lastIndexOf("."));
	// System.out.println(name);
	// }

}
