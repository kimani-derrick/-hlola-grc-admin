package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class A1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f8222a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f8223b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f8224c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
