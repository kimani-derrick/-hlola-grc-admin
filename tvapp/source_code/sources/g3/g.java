package g3;

import android.content.res.Resources;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Resources f10802a;

    /* renamed from: b  reason: collision with root package name */
    public String f10803b;

    public String a(String str) {
        String str2 = this.f10803b;
        Resources resources = this.f10802a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
