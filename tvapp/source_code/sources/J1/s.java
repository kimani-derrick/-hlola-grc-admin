package J1;

import com.boxhdo.android.data.model.response.trakt.TraktDeviceCodeResponse;
import com.boxhdo.domain.model.trakt.TraktDevice;
/* loaded from: classes.dex */
public final class s implements l {
    public static TraktDevice a(TraktDeviceCodeResponse traktDeviceCodeResponse) {
        String str;
        String str2;
        String str3;
        long j7;
        int i7;
        M5.g.f(traktDeviceCodeResponse, "dto");
        String str4 = traktDeviceCodeResponse.f7715a;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        String str5 = traktDeviceCodeResponse.f7716b;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        String str6 = traktDeviceCodeResponse.f7717c;
        if (str6 == null) {
            str3 = "";
        } else {
            str3 = str6;
        }
        Long l7 = traktDeviceCodeResponse.d;
        if (l7 != null) {
            j7 = l7.longValue();
        } else {
            j7 = 0;
        }
        long j8 = j7;
        Integer num = traktDeviceCodeResponse.f7718e;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        return new TraktDevice(i7, j8, str, str2, str3);
    }

    @Override // J1.l
    public final /* bridge */ /* synthetic */ Object s(Object obj) {
        return a((TraktDeviceCodeResponse) obj);
    }
}
