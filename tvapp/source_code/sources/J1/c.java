package J1;

import com.boxhdo.android.data.model.response.CompanyResponse;
import com.boxhdo.domain.model.Company;
/* loaded from: classes.dex */
public final class c implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        CompanyResponse companyResponse = (CompanyResponse) obj;
        M5.g.f(companyResponse, "dto");
        return new Company(companyResponse.f7425a, companyResponse.f7426b, companyResponse.f7427c, companyResponse.d, companyResponse.f7428e, companyResponse.f);
    }
}
