package s3;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f14089b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14090a;

    public i1(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f14090a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f14089b;
        for (int i7 = 0; i7 < 6; i7++) {
            String str = strArr[i7];
            HashMap hashMap = this.f14090a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f14090a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        return a().equalsIgnoreCase(((i1) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
