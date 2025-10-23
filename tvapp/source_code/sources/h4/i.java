package h4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.D;
import com.boxhdo.android.tv.R;
import g3.n;
import j3.AbstractC0839c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f11000a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11001b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11002c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11003e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11004g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z7;
        int i7 = AbstractC0839c.f11853a;
        if (str != null && !str.trim().isEmpty()) {
            z7 = false;
        } else {
            z7 = true;
        }
        n.i("ApplicationId must be set.", true ^ z7);
        this.f11001b = str;
        this.f11000a = str2;
        this.f11002c = str3;
        this.d = str4;
        this.f11003e = str5;
        this.f = str6;
        this.f11004g = str7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g3.g] */
    public static i a(Context context) {
        ?? obj = new Object();
        n.g(context);
        Resources resources = context.getResources();
        obj.f10802a = resources;
        obj.f10803b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String a7 = obj.a("google_app_id");
        if (TextUtils.isEmpty(a7)) {
            return null;
        }
        return new i(a7, obj.a("google_api_key"), obj.a("firebase_database_url"), obj.a("ga_trackingId"), obj.a("gcm_defaultSenderId"), obj.a("google_storage_bucket"), obj.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!n.j(this.f11001b, iVar.f11001b) || !n.j(this.f11000a, iVar.f11000a) || !n.j(this.f11002c, iVar.f11002c) || !n.j(this.d, iVar.d) || !n.j(this.f11003e, iVar.f11003e) || !n.j(this.f, iVar.f) || !n.j(this.f11004g, iVar.f11004g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11001b, this.f11000a, this.f11002c, this.d, this.f11003e, this.f, this.f11004g});
    }

    public final String toString() {
        D d = new D(this);
        d.c(this.f11001b, "applicationId");
        d.c(this.f11000a, "apiKey");
        d.c(this.f11002c, "databaseUrl");
        d.c(this.f11003e, "gcmSenderId");
        d.c(this.f, "storageBucket");
        d.c(this.f11004g, "projectId");
        return d.toString();
    }
}
