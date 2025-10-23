package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* loaded from: classes.dex */
public final class b extends J3.e {
    @Override // J3.e
    public final Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
