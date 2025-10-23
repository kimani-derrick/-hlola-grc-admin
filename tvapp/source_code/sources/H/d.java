package H;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f775a = new b(0);

    /* JADX WARN: Type inference failed for: r0v7, types: [H.k[], java.io.Serializable] */
    public static j a(Context context, e eVar) {
        Cursor cursor;
        c cVar;
        int i7;
        int i8;
        Uri withAppendedId;
        int i9;
        boolean z7;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) eVar.f777r;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) eVar.f778s;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                b bVar = f775a;
                Collections.sort(arrayList, bVar);
                List list = (List) eVar.f781v;
                if (list == null) {
                    list = C.b.k(resources, 0);
                }
                int i10 = 0;
                loop1: while (true) {
                    cursor = null;
                    if (i10 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, bVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        i10++;
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                if (resolveContentProvider == null) {
                    return new j(1, (Serializable) null);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                if (Build.VERSION.SDK_INT < 24) {
                    cVar = new c(context, build, 0);
                } else {
                    cVar = new c(context, build, 1);
                }
                try {
                    cursor = cVar.b(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) eVar.f779t});
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i7 = cursor.getInt(columnIndex);
                            } else {
                                i7 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i8 = cursor.getInt(columnIndex4);
                            } else {
                                i8 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i9 = cursor.getInt(columnIndex5);
                            } else {
                                i9 = 400;
                            }
                            int i12 = i9;
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            arrayList3.add(new k(uri, i8, i12, z7, i7));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    cVar.a();
                    return new j(0, (Serializable) ((k[]) arrayList3.toArray(new k[0])));
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    cVar.a();
                    throw th;
                }
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        throw new PackageManager.NameNotFoundException(AbstractC0515y1.x("No package found for authority: ", str));
    }
}
