package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.measurement.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404c {

    /* renamed from: a  reason: collision with root package name */
    public C0409d f8515a;

    /* renamed from: b  reason: collision with root package name */
    public C0409d f8516b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f8517c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.c] */
    public final Object clone() {
        C0409d c0409d = (C0409d) this.f8515a.clone();
        ?? obj = new Object();
        obj.f8515a = c0409d;
        obj.f8516b = (C0409d) c0409d.clone();
        obj.f8517c = new ArrayList();
        Iterator it = this.f8517c.iterator();
        while (it.hasNext()) {
            obj.f8517c.add((C0409d) ((C0409d) it.next()).clone());
        }
        return obj;
    }
}
