package A;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class h extends ContentProvider {

    /* renamed from: q  reason: collision with root package name */
    public static final File f2q = new File("/");

    /* renamed from: r  reason: collision with root package name */
    public static final HashMap f3r = new HashMap();

    public static String a(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static g b(Context context) {
        g gVar = new g();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.boxhdo.android.tv.provider", 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f2q;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a7 = f.a(context);
                            if (a7.length > 0) {
                                file = a7[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str = new String[]{attributeValue2}[0];
                            if (str != null) {
                                file = new File(file, str);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    gVar.f1b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e3) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e3);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return gVar;
                }
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority com.boxhdo.android.tv.provider");
        }
    }
}
