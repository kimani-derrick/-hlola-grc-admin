package h0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.leanback.widget.z0;
import g3.g;
/* renamed from: h0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741a {

    /* renamed from: c  reason: collision with root package name */
    public static C0741a f10862c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10863a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10864b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, h0.a] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, g3.g] */
    public static C0741a a(Context context) {
        boolean z7;
        if (f10862c == null) {
            ?? obj = new Object();
            PackageManager packageManager = context.getPackageManager();
            boolean z8 = false;
            g gVar = 0;
            Resources resources = null;
            String str = null;
            for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                String str2 = activityInfo.packageName;
                if (str2 != null && (activityInfo.applicationInfo.flags & 1) != 0) {
                    try {
                        resources = packageManager.getResourcesForApplication(str2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                str = str2;
                if (resources != null) {
                    break;
                }
            }
            if (resources != null) {
                gVar = new Object();
                gVar.f10802a = resources;
                gVar.f10803b = str;
            }
            Rect rect = z0.f6714x;
            obj.f10863a = false;
            if (gVar != 0) {
                String str3 = gVar.f10803b;
                Resources resources2 = gVar.f10802a;
                int identifier = resources2.getIdentifier("leanback_prefer_static_shadows", "bool", str3);
                if (identifier > 0) {
                    z7 = resources2.getBoolean(identifier);
                } else {
                    z7 = false;
                }
                obj.f10863a = z7;
            }
            obj.f10864b = false;
            if (gVar != 0) {
                String str4 = gVar.f10803b;
                Resources resources3 = gVar.f10802a;
                int identifier2 = resources3.getIdentifier("leanback_outline_clipping_disabled", "bool", str4);
                if (identifier2 > 0) {
                    z8 = resources3.getBoolean(identifier2);
                }
                obj.f10864b = z8;
            }
            f10862c = obj;
        }
        return f10862c;
    }
}
