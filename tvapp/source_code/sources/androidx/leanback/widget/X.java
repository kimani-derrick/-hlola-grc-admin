package androidx.leanback.widget;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public float f6564a;

    /* renamed from: b  reason: collision with root package name */
    public int f6565b;

    /* renamed from: c  reason: collision with root package name */
    public float f6566c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f6567e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f6568g;

    /* renamed from: h  reason: collision with root package name */
    public float f6569h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f6570i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PagingIndicator f6571j;

    public X(PagingIndicator pagingIndicator) {
        this.f6571j = pagingIndicator;
        this.f6570i = pagingIndicator.f6455q ? 1.0f : -1.0f;
    }

    public final void a() {
        int round = Math.round(this.f6564a * 255.0f);
        PagingIndicator pagingIndicator = this.f6571j;
        this.f6565b = Color.argb(round, Color.red(pagingIndicator.F), Color.green(pagingIndicator.F), Color.blue(pagingIndicator.F));
    }

    public final void b() {
        this.f6566c = 0.0f;
        this.d = 0.0f;
        PagingIndicator pagingIndicator = this.f6571j;
        this.f6567e = pagingIndicator.f6456r;
        float f = pagingIndicator.f6457s;
        this.f = f;
        this.f6568g = f * pagingIndicator.f6454L;
        this.f6564a = 0.0f;
        a();
    }
}
