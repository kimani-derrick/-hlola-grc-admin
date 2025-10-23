package J1;

import com.boxhdo.android.data.model.response.CountryResponse;
import com.boxhdo.domain.model.Country;
/* loaded from: classes.dex */
public final class e implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        String str;
        String str2;
        String str3;
        boolean z7;
        CountryResponse countryResponse = (CountryResponse) obj;
        M5.g.f(countryResponse, "dto");
        String str4 = countryResponse.f7453b;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        String str5 = countryResponse.f7454c;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        String str6 = countryResponse.d;
        if (str6 == null) {
            str3 = "";
        } else {
            str3 = str6;
        }
        Integer num = countryResponse.f7455e;
        if (num != null && num.intValue() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new Country(countryResponse.f7452a, str, str2, str3, z7);
    }
}
