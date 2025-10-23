package g3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class u {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f10822a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10823b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10824c;

    public u(String str, String str2, boolean z7) {
        n.c(str);
        this.f10822a = str;
        n.c(str2);
        this.f10823b = str2;
        this.f10824c = z7;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f10822a;
        if (str != null) {
            if (this.f10824c) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e3) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f10823b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (n.j(this.f10822a, uVar.f10822a) && n.j(this.f10823b, uVar.f10823b) && n.j(null, null) && this.f10824c == uVar.f10824c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10822a, this.f10823b, null, 4225, Boolean.valueOf(this.f10824c)});
    }

    public final String toString() {
        String str = this.f10822a;
        if (str != null) {
            return str;
        }
        n.g(null);
        throw null;
    }
}
