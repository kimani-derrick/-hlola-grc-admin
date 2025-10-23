package V4;

import android.content.Context;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f3726c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f3727a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3728b;

    public q(Context context, String str) {
        this.f3727a = context;
        this.f3728b = str;
    }

    public final synchronized void a() {
        this.f3727a.deleteFile(this.f3728b);
    }
}
