package B4;

import android.content.Context;
/* loaded from: classes.dex */
public class b implements C4.a, m3.c {

    /* renamed from: q  reason: collision with root package name */
    public final int f259q;

    public b() {
        this.f259q = 1024;
    }

    @Override // m3.c
    public int e(Context context, String str) {
        return this.f259q;
    }

    @Override // m3.c
    public int n(Context context, String str, boolean z7) {
        return 0;
    }

    @Override // C4.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i7 = this.f259q;
        if (length <= i7) {
            return stackTraceElementArr;
        }
        int i8 = i7 / 2;
        int i9 = i7 - i8;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i9);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i8, stackTraceElementArr2, i9, i8);
        return stackTraceElementArr2;
    }
}
