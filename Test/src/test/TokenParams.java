package test;


import com.gvc.casino.vendor.mgs.util.IMGSConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class TokenParams implements Serializable {
	private static final long serialVersionUID = -491226028083456336L;
	private final String secureToken;
	private final String skinCode;
	private final String channel;
	private final String gameCode;
	private final String accountId;
	private final String currencyCode;
	private final String lanunage;
	private final String brandId;
	private final boolean isUSBrand;

	public TokenParams(String secureToken, String skinCode, String channel, String gameCode, String accountId,
			String currencyCode, String lanunage, String brandId, boolean isUSBrand) {
		this.secureToken = secureToken;
		this.skinCode = skinCode;
		this.channel = channel;
		this.gameCode = gameCode;
		this.accountId = accountId;
		this.currencyCode = currencyCode;
		this.lanunage = lanunage;
		this.brandId = brandId;
		this.isUSBrand = isUSBrand;
	}
	
	public String getBrandId() {
		return brandId;
	}

	public String getSecureToken() {
		return secureToken;
	}

	public String getSkinCode() {
		return skinCode;
	}

	public String getChannel() {
		return channel;
	}

	public String getGameCode() {
		return gameCode;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public String getLanunage() {
		return lanunage;
	}
	
	public boolean isUSBrand() {
		return isUSBrand;
	}
	
	@Override
	public String toString() {
	    return "TokenParams{" +
	           "secureToken='" + secureToken + '\'' +
	           ", skinCode='" + skinCode + '\'' +
	           ", channel='" + channel + '\'' +
	           ", gameCode='" + gameCode + '\'' +
	           ", accountId='" + accountId + '\'' +
	           ", currencyCode='" + currencyCode + '\'' +
	           ", lanunage='" + lanunage + '\'' +
	           ", brandId='" + brandId + '\'' +
	           ", isUSBrand=" + isUSBrand +
	           '}';
	}

	
}
