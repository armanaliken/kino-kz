package bitlab.kinokz.qrCode;

public interface QrCodeGenerator {
	byte [] generateQrCode(String grContent, int width, int height);
}
