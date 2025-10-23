package com.google.android.gms.internal.measurement;

import android.net.Uri;
import o.C1052e;
/* loaded from: classes.dex */
public abstract class O1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1052e f8387a = new o.j();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (O1.class) {
            C1052e c1052e = f8387a;
            uri = (Uri) c1052e.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                c1052e.put(str, uri);
            }
        }
        return uri;
    }
}
