package X2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: X2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121c extends View implements G {

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f4159q;

    /* renamed from: r  reason: collision with root package name */
    public List f4160r;

    /* renamed from: s  reason: collision with root package name */
    public int f4161s;

    /* renamed from: t  reason: collision with root package name */
    public float f4162t;

    /* renamed from: u  reason: collision with root package name */
    public C0122d f4163u;

    /* renamed from: v  reason: collision with root package name */
    public float f4164v;

    public C0121c(Context context) {
        super(context, null);
        this.f4159q = new ArrayList();
        this.f4160r = Collections.emptyList();
        this.f4161s = 0;
        this.f4162t = 0.0533f;
        this.f4163u = C0122d.f4165g;
        this.f4164v = 0.08f;
    }

    @Override // X2.G
    public final void a(List list, C0122d c0122d, float f, int i7, float f7) {
        this.f4160r = list;
        this.f4163u = c0122d;
        this.f4162t = f;
        this.f4161s = i7;
        this.f4164v = f7;
        while (true) {
            ArrayList arrayList = this.f4159q;
            if (arrayList.size() < list.size()) {
                arrayList.add(new F(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.C0121c.dispatchDraw(android.graphics.Canvas):void");
    }
}
