package ru.bearchik.bitbucket.hook;

import com.atlassian.bitbucket.hook.repository.PreRepositoryHookContext;
import com.atlassian.bitbucket.hook.repository.PullRequestMergeHookRequest;
import com.atlassian.bitbucket.hook.repository.RepositoryHookResult;
import com.atlassian.bitbucket.hook.repository.RepositoryMergeCheck;

import javax.annotation.Nonnull;


public class WipMergeCheck implements RepositoryMergeCheck
{
    

    @Nonnull
    @Override
    public RepositoryHookResult preUpdate(@Nonnull PreRepositoryHookContext preRepositoryHookContext, @Nonnull PullRequestMergeHookRequest pullRequestMergeHookRequest) {
        String summaryMsg = "Work in progress";
        String detailedMsg = "Work in progress in this PR. Merging is not allowed";
        String wipStatus = "WIP:";

        if (pullRequestMergeHookRequest.getPullRequest().getTitle().startsWith(wipStatus)) {
            return RepositoryHookResult.rejected(summaryMsg, detailedMsg);
        }

        return RepositoryHookResult.accepted();
    }
}
