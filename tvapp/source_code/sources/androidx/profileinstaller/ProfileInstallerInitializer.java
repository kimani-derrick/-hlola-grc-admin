package androidx.profileinstaller;

import A4.d;
import F0.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import s3.C1209y;
import u0.f;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // F0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // F0.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1209y(29);
        }
        f.a(new d(this, 19, context.getApplicationContext()));
        return new C1209y(29);
    }
}
