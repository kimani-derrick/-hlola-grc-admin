package C;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f335a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f336b;

    /* renamed from: c  reason: collision with root package name */
    public final int f337c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f335a = colorStateList;
        this.f336b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f337c = hashCode;
    }
}
