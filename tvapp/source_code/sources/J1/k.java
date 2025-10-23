package J1;

import com.boxhdo.android.data.model.response.LatestVersionResponse;
import com.boxhdo.domain.model.LatestVersion;
/* loaded from: classes.dex */
public final class k implements l {
    public static LatestVersion a(LatestVersionResponse latestVersionResponse) {
        String str;
        int i7;
        String str2;
        String str3;
        boolean z7;
        Integer num;
        Integer num2;
        String str4 = null;
        if (latestVersionResponse != null) {
            str = latestVersionResponse.f7541b;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (latestVersionResponse != null && (num2 = latestVersionResponse.f7542c) != null) {
            i7 = num2.intValue();
        } else {
            i7 = 0;
        }
        if (latestVersionResponse != null) {
            str2 = latestVersionResponse.d;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (latestVersionResponse != null) {
            str4 = latestVersionResponse.f7543e;
        }
        if (str4 == null) {
            str3 = "";
        } else {
            str3 = str4;
        }
        if (latestVersionResponse != null && (num = latestVersionResponse.f) != null && num.intValue() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new LatestVersion(str, i7, str2, str3, z7);
    }

    @Override // J1.l
    public final /* bridge */ /* synthetic */ Object s(Object obj) {
        return a((LatestVersionResponse) obj);
    }
}
