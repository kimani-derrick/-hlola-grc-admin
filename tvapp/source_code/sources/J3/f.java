package J3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f1332a;

    /* renamed from: b  reason: collision with root package name */
    public E3.a f1333b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1334c;
    public ColorStateList d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f1335e;
    public ColorStateList f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1336g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f1337h;

    /* renamed from: i  reason: collision with root package name */
    public float f1338i;

    /* renamed from: j  reason: collision with root package name */
    public float f1339j;

    /* renamed from: k  reason: collision with root package name */
    public float f1340k;

    /* renamed from: l  reason: collision with root package name */
    public int f1341l;

    /* renamed from: m  reason: collision with root package name */
    public float f1342m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f1343o;

    /* renamed from: p  reason: collision with root package name */
    public int f1344p;

    /* renamed from: q  reason: collision with root package name */
    public int f1345q;

    /* renamed from: r  reason: collision with root package name */
    public int f1346r;

    /* renamed from: s  reason: collision with root package name */
    public int f1347s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1348t;

    /* renamed from: u  reason: collision with root package name */
    public Paint.Style f1349u;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f1366u = true;
        return gVar;
    }
}
