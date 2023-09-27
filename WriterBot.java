{"payload":{"allShortcutsEnabled":true,"fileTree":{"Programming Project 3/src/Prog3":{"items":[{"name":"CustomHashTable.java","path":"Programming Project 3/src/Prog3/CustomHashTable.java","contentType":"file"},{"name":"CustomLinklist.java","path":"Programming Project 3/src/Prog3/CustomLinklist.java","contentType":"file"},{"name":"WriterBot.java","path":"Programming Project 3/src/Prog3/WriterBot.java","contentType":"file"}],"totalCount":3},"Programming Project 3/src":{"items":[{"name":"Prog3","path":"Programming Project 3/src/Prog3","contentType":"directory"}],"totalCount":1},"Programming Project 3":{"items":[{"name":".idea","path":"Programming Project 3/.idea","contentType":"directory"},{"name":"src","path":"Programming Project 3/src","contentType":"directory"},{"name":".gitignore","path":"Programming Project 3/.gitignore","contentType":"file"},{"name":"ReadMe.md","path":"Programming Project 3/ReadMe.md","contentType":"file"}],"totalCount":4},"":{"items":[{"name":"Programming Project 1","path":"Programming Project 1","contentType":"directory"},{"name":"Programming Project 2","path":"Programming Project 2","contentType":"directory"},{"name":"Programming Project 3","path":"Programming Project 3","contentType":"directory"},{"name":".gitignore","path":".gitignore","contentType":"file"},{"name":"HW1.md","path":"HW1.md","contentType":"file"},{"name":"HW2.md","path":"HW2.md","contentType":"file"},{"name":"HW3.md","path":"HW3.md","contentType":"file"},{"name":"HW4.md","path":"HW4.md","contentType":"file"},{"name":"HW5.md","path":"HW5.md","contentType":"file"},{"name":"Prog1.md","path":"Prog1.md","contentType":"file"},{"name":"Prog2.md","path":"Prog2.md","contentType":"file"},{"name":"Prog3.md","path":"Prog3.md","contentType":"file"},{"name":"hello.java","path":"hello.java","contentType":"file"}],"totalCount":13}},"fileTreeProcessingTime":8.778296999999998,"foldersToFetch":[],"reducedMotionEnabled":"system","repo":{"id":656772281,"defaultBranch":"main","name":"CSDS233-s23-2","ownerLogin":"cwru-courses","currentUserCanPush":true,"isFork":false,"isEmpty":false,"createdAt":"2023-06-21T11:51:42.000-04:00","ownerAvatar":"https://avatars.githubusercontent.com/u/58530518?v=4","public":false,"private":true,"isOrgOwned":true},"symbolsExpanded":false,"treeExpanded":true,"refInfo":{"name":"main","listCacheKey":"v0:1690384679.0","canEdit":true,"refType":"branch","currentOid":"4ac67b4dafdf7c76dfb03adc87afb85b208c6755"},"path":"Programming Project 3/src/Prog3/WriterBot.java","currentUser":{"id":137304377,"login":"Jia22k","userEmail":"jxk1403@case.edu"},"blob":{"rawLines":["package Prog3;","","import java.io.BufferedReader;","import java.io.FileReader;","import java.io.FileWriter;","import java.security.InvalidParameterException;","import java.util.NoSuchElementException;","import java.util.concurrent.ThreadLocalRandom;","","public class WriterBot {","    public static void main(String[] args) {","        try{","            Long x = System.currentTimeMillis();","            int k = Integer.parseInt(args[0]);","            if(k < 0){","                throw new InvalidParameterException();","            }","            int len = Integer.parseInt(args[1]);","            if(len < 0){","                throw new InvalidParameterException();","            }","            BufferedReader br = new BufferedReader(new FileReader(args[2]));","            StringBuilder string = new StringBuilder();","            CustomHashTable hashTable = new CustomHashTable();","            String reader;","            while (( reader = br.readLine()) != null) {","                string.append(reader);","                string.append('\\n');","            }","            br.close();","            if(string.length() < k){","                throw new InvalidParameterException();","            }","            char[] chars = new char[k];","            for (int count = 0; count + k < string.length(); count++) {","                for (int index = 0; index < chars.length; index++) {","                    chars[index] = Character.toLowerCase(string.charAt(count + index));","                }","                hashTable.insert(Character.toLowerCase(string.charAt(count + k)), chars);","            }","            int count = ThreadLocalRandom.current().nextInt(0, 101);","            chars = new char[k];","            for (int index = 0; index < chars.length; index++) {","                chars[index] = Character.toLowerCase(string.charAt(count + index));","            }","            StringBuilder result = new StringBuilder();","            result.append(chars);","            while (result.length() < len) {","                try {","                    char c = hashTable.getElement(chars);","                    result.append(c);","                    for (int index = 0; index < chars.length - 1; index++) {","                        chars[index] = chars[index + 1];","                    }","                    chars[chars.length - 1] = c;","                } catch (NoSuchElementException e) {","                    result.append(\". \");","                    count = ((count + 1) % string.length());","                    for (int index = 0; index < chars.length; index++) {","                        chars[index] = Character.toLowerCase(string.charAt((count + index) % string.length()));","                    }","                }","            }","            System.out.println(\"The runtime was \" + (System.currentTimeMillis()-x) + \"ms\");","            FileWriter output = new FileWriter(args[3]);","            output.write(result.toString());","            output.close();","            System.out.println(\"output file is name: \"+ args[3] + \".txt\");","        } catch (Exception e){","            System.out.println(\"Operations stopped due to error: \" + e.toString());","        }","    }","}"],"stylingDirectives":[[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":13,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":29,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":25,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":25,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":20,"cssClass":"pl-s1"},{"start":21,"end":46,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":39,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"},{"start":17,"end":27,"cssClass":"pl-s1"},{"start":28,"end":45,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":22,"cssClass":"pl-smi"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":22,"cssClass":"pl-smi"},{"start":23,"end":27,"cssClass":"pl-en"},{"start":28,"end":34,"cssClass":"pl-smi"},{"start":37,"end":41,"cssClass":"pl-s1"}],[{"start":8,"end":11,"cssClass":"pl-k"}],[{"start":12,"end":16,"cssClass":"pl-smi"},{"start":17,"end":18,"cssClass":"pl-s1"},{"start":21,"end":27,"cssClass":"pl-smi"},{"start":28,"end":45,"cssClass":"pl-en"}],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":17,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-smi"},{"start":28,"end":36,"cssClass":"pl-en"},{"start":37,"end":41,"cssClass":"pl-s1"},{"start":42,"end":43,"cssClass":"pl-c1"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":16,"cssClass":"pl-s1"},{"start":19,"end":20,"cssClass":"pl-c1"}],[{"start":16,"end":21,"cssClass":"pl-k"},{"start":22,"end":25,"cssClass":"pl-k"},{"start":26,"end":51,"cssClass":"pl-smi"}],[],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":19,"cssClass":"pl-s1"},{"start":22,"end":29,"cssClass":"pl-smi"},{"start":30,"end":38,"cssClass":"pl-en"},{"start":39,"end":43,"cssClass":"pl-s1"},{"start":44,"end":45,"cssClass":"pl-c1"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":21,"end":22,"cssClass":"pl-c1"}],[{"start":16,"end":21,"cssClass":"pl-k"},{"start":22,"end":25,"cssClass":"pl-k"},{"start":26,"end":51,"cssClass":"pl-smi"}],[],[{"start":12,"end":26,"cssClass":"pl-smi"},{"start":27,"end":29,"cssClass":"pl-s1"},{"start":32,"end":35,"cssClass":"pl-k"},{"start":36,"end":50,"cssClass":"pl-smi"},{"start":51,"end":54,"cssClass":"pl-k"},{"start":55,"end":65,"cssClass":"pl-smi"},{"start":66,"end":70,"cssClass":"pl-s1"},{"start":71,"end":72,"cssClass":"pl-c1"}],[{"start":12,"end":25,"cssClass":"pl-smi"},{"start":26,"end":32,"cssClass":"pl-s1"},{"start":35,"end":38,"cssClass":"pl-k"},{"start":39,"end":52,"cssClass":"pl-smi"}],[{"start":12,"end":27,"cssClass":"pl-smi"},{"start":28,"end":37,"cssClass":"pl-s1"},{"start":40,"end":43,"cssClass":"pl-k"},{"start":44,"end":59,"cssClass":"pl-smi"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":25,"cssClass":"pl-s1"}],[{"start":12,"end":17,"cssClass":"pl-k"},{"start":21,"end":27,"cssClass":"pl-s1"},{"start":30,"end":32,"cssClass":"pl-s1"},{"start":33,"end":41,"cssClass":"pl-en"},{"start":48,"end":52,"cssClass":"pl-c1"}],[{"start":16,"end":22,"cssClass":"pl-s1"},{"start":23,"end":29,"cssClass":"pl-en"},{"start":30,"end":36,"cssClass":"pl-s1"}],[{"start":16,"end":22,"cssClass":"pl-s1"},{"start":23,"end":29,"cssClass":"pl-en"},{"start":30,"end":34,"cssClass":"pl-s"}],[],[{"start":12,"end":14,"cssClass":"pl-s1"},{"start":15,"end":20,"cssClass":"pl-en"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":21,"cssClass":"pl-s1"},{"start":22,"end":28,"cssClass":"pl-en"},{"start":33,"end":34,"cssClass":"pl-s1"}],[{"start":16,"end":21,"cssClass":"pl-k"},{"start":22,"end":25,"cssClass":"pl-k"},{"start":26,"end":51,"cssClass":"pl-smi"}],[],[{"start":12,"end":16,"cssClass":"pl-smi"},{"start":19,"end":24,"cssClass":"pl-s1"},{"start":27,"end":30,"cssClass":"pl-k"},{"start":31,"end":35,"cssClass":"pl-smi"},{"start":36,"end":37,"cssClass":"pl-s1"}],[{"start":12,"end":15,"cssClass":"pl-k"},{"start":17,"end":20,"cssClass":"pl-smi"},{"start":21,"end":26,"cssClass":"pl-s1"},{"start":29,"end":30,"cssClass":"pl-c1"},{"start":32,"end":37,"cssClass":"pl-s1"},{"start":40,"end":41,"cssClass":"pl-s1"},{"start":44,"end":50,"cssClass":"pl-s1"},{"start":51,"end":57,"cssClass":"pl-en"},{"start":61,"end":66,"cssClass":"pl-s1"}],[{"start":16,"end":19,"cssClass":"pl-k"},{"start":21,"end":24,"cssClass":"pl-smi"},{"start":25,"end":30,"cssClass":"pl-s1"},{"start":33,"end":34,"cssClass":"pl-c1"},{"start":36,"end":41,"cssClass":"pl-s1"},{"start":44,"end":49,"cssClass":"pl-s1"},{"start":50,"end":56,"cssClass":"pl-s1"},{"start":58,"end":63,"cssClass":"pl-s1"}],[{"start":20,"end":25,"cssClass":"pl-s1"},{"start":26,"end":31,"cssClass":"pl-s1"},{"start":35,"end":44,"cssClass":"pl-smi"},{"start":45,"end":56,"cssClass":"pl-en"},{"start":57,"end":63,"cssClass":"pl-s1"},{"start":64,"end":70,"cssClass":"pl-en"},{"start":71,"end":76,"cssClass":"pl-s1"},{"start":79,"end":84,"cssClass":"pl-s1"}],[],[{"start":16,"end":25,"cssClass":"pl-s1"},{"start":26,"end":32,"cssClass":"pl-en"},{"start":33,"end":42,"cssClass":"pl-smi"},{"start":43,"end":54,"cssClass":"pl-en"},{"start":55,"end":61,"cssClass":"pl-s1"},{"start":62,"end":68,"cssClass":"pl-en"},{"start":69,"end":74,"cssClass":"pl-s1"},{"start":77,"end":78,"cssClass":"pl-s1"},{"start":82,"end":87,"cssClass":"pl-s1"}],[],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":21,"cssClass":"pl-s1"},{"start":24,"end":41,"cssClass":"pl-smi"},{"start":42,"end":49,"cssClass":"pl-en"},{"start":52,"end":59,"cssClass":"pl-en"},{"start":60,"end":61,"cssClass":"pl-c1"},{"start":63,"end":66,"cssClass":"pl-c1"}],[{"start":12,"end":17,"cssClass":"pl-s1"},{"start":20,"end":23,"cssClass":"pl-k"},{"start":24,"end":28,"cssClass":"pl-smi"},{"start":29,"end":30,"cssClass":"pl-s1"}],[{"start":12,"end":15,"cssClass":"pl-k"},{"start":17,"end":20,"cssClass":"pl-smi"},{"start":21,"end":26,"cssClass":"pl-s1"},{"start":29,"end":30,"cssClass":"pl-c1"},{"start":32,"end":37,"cssClass":"pl-s1"},{"start":40,"end":45,"cssClass":"pl-s1"},{"start":46,"end":52,"cssClass":"pl-s1"},{"start":54,"end":59,"cssClass":"pl-s1"}],[{"start":16,"end":21,"cssClass":"pl-s1"},{"start":22,"end":27,"cssClass":"pl-s1"},{"start":31,"end":40,"cssClass":"pl-smi"},{"start":41,"end":52,"cssClass":"pl-en"},{"start":53,"end":59,"cssClass":"pl-s1"},{"start":60,"end":66,"cssClass":"pl-en"},{"start":67,"end":72,"cssClass":"pl-s1"},{"start":75,"end":80,"cssClass":"pl-s1"}],[],[{"start":12,"end":25,"cssClass":"pl-smi"},{"start":26,"end":32,"cssClass":"pl-s1"},{"start":35,"end":38,"cssClass":"pl-k"},{"start":39,"end":52,"cssClass":"pl-smi"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":25,"cssClass":"pl-en"},{"start":26,"end":31,"cssClass":"pl-s1"}],[{"start":12,"end":17,"cssClass":"pl-k"},{"start":19,"end":25,"cssClass":"pl-s1"},{"start":26,"end":32,"cssClass":"pl-en"},{"start":37,"end":40,"cssClass":"pl-s1"}],[{"start":16,"end":19,"cssClass":"pl-k"}],[{"start":20,"end":24,"cssClass":"pl-smi"},{"start":25,"end":26,"cssClass":"pl-s1"},{"start":29,"end":38,"cssClass":"pl-s1"},{"start":39,"end":49,"cssClass":"pl-en"},{"start":50,"end":55,"cssClass":"pl-s1"}],[{"start":20,"end":26,"cssClass":"pl-s1"},{"start":27,"end":33,"cssClass":"pl-en"},{"start":34,"end":35,"cssClass":"pl-s1"}],[{"start":20,"end":23,"cssClass":"pl-k"},{"start":25,"end":28,"cssClass":"pl-smi"},{"start":29,"end":34,"cssClass":"pl-s1"},{"start":37,"end":38,"cssClass":"pl-c1"},{"start":40,"end":45,"cssClass":"pl-s1"},{"start":48,"end":53,"cssClass":"pl-s1"},{"start":54,"end":60,"cssClass":"pl-s1"},{"start":63,"end":64,"cssClass":"pl-c1"},{"start":66,"end":71,"cssClass":"pl-s1"}],[{"start":24,"end":29,"cssClass":"pl-s1"},{"start":30,"end":35,"cssClass":"pl-s1"},{"start":39,"end":44,"cssClass":"pl-s1"},{"start":45,"end":50,"cssClass":"pl-s1"},{"start":53,"end":54,"cssClass":"pl-c1"}],[],[{"start":20,"end":25,"cssClass":"pl-s1"},{"start":26,"end":31,"cssClass":"pl-s1"},{"start":32,"end":38,"cssClass":"pl-s1"},{"start":41,"end":42,"cssClass":"pl-c1"},{"start":46,"end":47,"cssClass":"pl-s1"}],[{"start":18,"end":23,"cssClass":"pl-k"},{"start":25,"end":47,"cssClass":"pl-smi"},{"start":48,"end":49,"cssClass":"pl-s1"}],[{"start":20,"end":26,"cssClass":"pl-s1"},{"start":27,"end":33,"cssClass":"pl-en"},{"start":34,"end":38,"cssClass":"pl-s"}],[{"start":20,"end":25,"cssClass":"pl-s1"},{"start":30,"end":35,"cssClass":"pl-s1"},{"start":38,"end":39,"cssClass":"pl-c1"},{"start":43,"end":49,"cssClass":"pl-s1"},{"start":50,"end":56,"cssClass":"pl-en"}],[{"start":20,"end":23,"cssClass":"pl-k"},{"start":25,"end":28,"cssClass":"pl-smi"},{"start":29,"end":34,"cssClass":"pl-s1"},{"start":37,"end":38,"cssClass":"pl-c1"},{"start":40,"end":45,"cssClass":"pl-s1"},{"start":48,"end":53,"cssClass":"pl-s1"},{"start":54,"end":60,"cssClass":"pl-s1"},{"start":62,"end":67,"cssClass":"pl-s1"}],[{"start":24,"end":29,"cssClass":"pl-s1"},{"start":30,"end":35,"cssClass":"pl-s1"},{"start":39,"end":48,"cssClass":"pl-smi"},{"start":49,"end":60,"cssClass":"pl-en"},{"start":61,"end":67,"cssClass":"pl-s1"},{"start":68,"end":74,"cssClass":"pl-en"},{"start":76,"end":81,"cssClass":"pl-s1"},{"start":84,"end":89,"cssClass":"pl-s1"},{"start":93,"end":99,"cssClass":"pl-s1"},{"start":100,"end":106,"cssClass":"pl-en"}],[],[],[],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":49,"cssClass":"pl-s"},{"start":53,"end":59,"cssClass":"pl-smi"},{"start":60,"end":77,"cssClass":"pl-en"},{"start":80,"end":81,"cssClass":"pl-s1"},{"start":85,"end":89,"cssClass":"pl-s"}],[{"start":12,"end":22,"cssClass":"pl-smi"},{"start":23,"end":29,"cssClass":"pl-s1"},{"start":32,"end":35,"cssClass":"pl-k"},{"start":36,"end":46,"cssClass":"pl-smi"},{"start":47,"end":51,"cssClass":"pl-s1"},{"start":52,"end":53,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":24,"cssClass":"pl-en"},{"start":25,"end":31,"cssClass":"pl-s1"},{"start":32,"end":40,"cssClass":"pl-en"}],[{"start":12,"end":18,"cssClass":"pl-s1"},{"start":19,"end":24,"cssClass":"pl-en"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":54,"cssClass":"pl-s"},{"start":56,"end":60,"cssClass":"pl-s1"},{"start":61,"end":62,"cssClass":"pl-c1"},{"start":66,"end":72,"cssClass":"pl-s"}],[{"start":10,"end":15,"cssClass":"pl-k"},{"start":17,"end":26,"cssClass":"pl-smi"},{"start":27,"end":28,"cssClass":"pl-s1"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":66,"cssClass":"pl-s"},{"start":69,"end":70,"cssClass":"pl-s1"},{"start":71,"end":79,"cssClass":"pl-en"}],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":null,"configFilePath":null,"networkDependabotPath":"/cwru-courses/CSDS233-s23-2/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false,"repoAlertsPath":"/cwru-courses/CSDS233-s23-2/security/dependabot","repoSecurityAndAnalysisPath":"/cwru-courses/CSDS233-s23-2/settings/security_analysis","repoOwnerIsOrg":true,"currentUserCanAdminRepo":true},"displayName":"WriterBot.java","displayUrl":"https://github.com/cwru-courses/CSDS233-s23-2/blob/main/Programming%20Project%203/src/Prog3/WriterBot.java?raw=true","headerInfo":{"blobSize":"3.02 KB","deleteInfo":{"deleteTooltip":"Delete this file"},"editInfo":{"editTooltip":"Edit this file"},"ghDesktopPath":"x-github-client://openRepo/https://github.com/cwru-courses/CSDS233-s23-2?branch=main&filepath=Programming%20Project%203%2Fsrc%2FProg3%2FWriterBot.java","gitLfsPath":null,"onBranch":true,"shortPath":"61d00ad","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fcwru-courses%2FCSDS233-s23-2%2Fblob%2Fmain%2FProgramming%2520Project%25203%2Fsrc%2FProg3%2FWriterBot.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"73","truncatedSloc":"71"},"mode":"file"},"image":false,"isCodeownersFile":null,"isPlain":false,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","languageID":181,"large":false,"loggedIn":true,"newDiscussionPath":"/cwru-courses/CSDS233-s23-2/discussions/new","newIssuePath":"/cwru-courses/CSDS233-s23-2/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/cwru-courses/CSDS233-s23-2/blob/main/Programming%20Project%203/src/Prog3/WriterBot.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/cwru-courses/CSDS233-s23-2/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"shortPath":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"cwru-courses","repoName":"CSDS233-s23-2","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":null,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"WriterBot","kind":"class","identStart":251,"identEnd":260,"extentStart":238,"extentEnd":3087,"fullyQualifiedName":"WriterBot","identUtf16":{"start":{"lineNumber":9,"utf16Col":13},"end":{"lineNumber":9,"utf16Col":22}},"extentUtf16":{"start":{"lineNumber":9,"utf16Col":0},"end":{"lineNumber":72,"utf16Col":1}}},{"name":"main","kind":"method","identStart":286,"identEnd":290,"extentStart":267,"extentEnd":3085,"fullyQualifiedName":"WriterBot::main","identUtf16":{"start":{"lineNumber":10,"utf16Col":23},"end":{"lineNumber":10,"utf16Col":27}},"extentUtf16":{"start":{"lineNumber":10,"utf16Col":4},"end":{"lineNumber":71,"utf16Col":5}}}]}},"copilotInfo":null,"csrf_tokens":{"/cwru-courses/CSDS233-s23-2/branches":{"post":"cbHdGrFT2dezuyrzrt5xuZnuiAhPTxt2pdQ7_NCy7mWXJMN-iED62Q75Ep3W2BDEVtvZdWAeN5OkD5WcPSXCBg"},"/repos/preferences":{"post":"fuZ1KvVZxgMK6PwxtUqgNLdy4BjvhSahgSXzoPQ8J_N-FedjAJ-qYfLLAvkGTb2qzH-mOjZU4svBZebn2wBy9g"}}},"title":"CSDS233-s23-2/Programming Project 3/src/Prog3/WriterBot.java at main · cwru-courses/CSDS233-s23-2"}